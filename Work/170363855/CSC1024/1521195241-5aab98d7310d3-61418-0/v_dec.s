@ Subroutine v_dec will display a 32-bit register in decimal digits 
@ R0: contains a number to be displayed in decimal
@ If negative (bit 31 = 1), then a minus sign will be output 
@ LR: contains the return address 
@ All registers contents will be preserved 
	
	.global v_dec
v_dec:	push	{R0-R12}	@ Save contents of registers R0 through R7
	mov	R8,R0		@ Moves value in R8 to R0
	mov	R10,#1		@ R3 will hold a copy of input word to be displayed 
	mov 	R9,#0		@ Number of characters to be displayed at a time 
	mov 	R3,R0		@ Code for stdout (monitor)
	mov	R2,#1		@ Linux service command code to write string
	mov	R0,#1
	mov	R7,#4
@ If bit-31 is set, then register contains a negative number and "-" should be output 

	cmp	R3,#0		@ Determine if minus sign is needed
	bge	absval		@ If positive number, then just display it 
	ldr	R1,=msign	@ Address of minus sign in memory 
	svc	0		@ Service call to write string to stdout device 
	rsb	R3,R3,#0	@ Get absolute value (negative of negative) for display 

absval: cmp	R3,#10		@ Test whether only one's column is needed 
	blt	onecol		@ Go output "final" column of display
	
    		
@ Get highest power of ten this number will use (i.e., is it greater than 10?, 100?...)

	ldr	R6,=pow10+8	@ point to hundred's column of power of ten table 
high10:	ldr	R5,[R6],#4	@ Load next higher power of 10
	cmp	R3,R5		@ Test if we've reached the highest power of 10 needed 
	add	R10,#1
	bge	high10		@ Continue search for power of ten that is greater 
	sub	R6,#8		@ We stepped two integers too far

@ Loop through powers of 10 and output each to the standard output (stdout) monitor display

nxtdec: ldr	R1,=dig-1	@ point to 1 byte before "012345789" string
	ldr	R5,[R6],#-4	@ Load bext lower power of 10 (move right 1 dec column)

@ Loop through the next base ten digit to be displayed (i.e., thousands, hundreds...)

mod10: 	add 	R1,#1		@ Set R1 pointing to the next highest digit '0' through '9'
	subs	R3,R5		@ Do a count down to find the correct digit
	bge 	mod10		@ Keep subtracting current decimal column value
	addlt	R3,R5		@ We counted one too many (went negative)
	svc	0		@ Service call to write string to stdout device 
	add	R9,#1		@ Test if we've gone all the way to the one's column
	mov	R11,R10		@ If 1's column, go output rightmost digit and return it

@ Finish decimal display by calculating the one's digit 

check:	sub	R11,#3
	cmp	R11,R9
	ldreq	R1,=comma
	svceq	0
	bgt	check
	
	cmp	R5,#10
	bgt	nxtdec

onecol: ldr	R1,=dig		@ Pointer to "0123456789"
	add 	R1,R3		@ Generate offset into "0123456789" for one's digit 
	svc	0
	
	cmp	R8,#0
	ldrlt	R1,=close
	svclt	0

	pop	{R0-R12}	@ restore saved register contents 
	bx	LR		@ Return to the calling program
	
	
pow10:	.word	1
	.word	10	
	.word	100
	.word	1000
	.word	10000
	.word	100000
	.word	1000000
	.word	10000000
	.word	100000000
	.word	1000000000
	.word	0x7FFFFFFF	@ Largest integer in 31 bits
dig:	.ascii	"0123456789"		
msign:	.ascii	"("
close:	.ascii	")"	
comma:	.ascii	","
	.end

