 .global generate4


generate4:
	push {R0-R8}      @ Pushes these registers onto a stack
    	and R5, R0, #1    @ The number is masked to get the first bit 
    	mov R1, R5        @ The bit is moved to register 1
        
    	mov R5, R0        @ Move the value of register 0 to register 5
    	lsr R5, #1        @ The value is shifted once to te right
    	and R5, R5, #1    @ The number is masked to get the first bit 
    	mov R2, R5        @ The bit is moved to register 2
    
    	mov R5, R0        @ Move the value of register 0 to register 5
    	lsr R5, #2        @ The value is shifted twice to te right
    	and R5, R5, #1    @ The number is masked to get the first bit 
    	mov R3, R5        @ The bit is moved to register 3
    
    	mov R5, R0        @ Move the value of register 0 to register 5
    	lsr R5, #3        @ The value is shifted three times to te right
    	and R5, R5, #1    @ The number is masked to get the first bit 
    	mov R4, R5        @ The bit is moved to register 4

    	eor R6, R1, R2    @ The registers 1 and 2 are put through a exclusive or and the result is then given to register 6
    	eor R6, R6, R4    @ The registers 6 and 4 are put through a exclusive or and the result is then given to register 6

    	eor R7, R2, R4    @ The registers 2 and 4 are put through a exclusive or and the result is then given to register 7
    	eor R7, R7, R3    @ The registers 7 and 3 are put through a exclusive or and the result is then given to register 7
    
    	eor R8, R1, R4    @ The registers 1 and 4 are put through a exclusive or and the result is then given to register 8
    	eor R8, R8, R3    @ The registers 8 and 3 are put through a exclusive or and the result is then given to register 8
    
    	cmp R6, #1        @ The registers 6 and 1 are compared
    	addeq R0, #16     @ If its equals 1 add 16

    	cmp R7,#1         @ The registers 7 and 1 are compared
    	addeq R0, #32     @ If its equals 1 add 32

    	cmp R8,#1         @ The registers 8 and 1 are compared
    	addeq R0, #64     @ If its equals 1 add 64

 	pop {R0-R8}       @ Pops these registers of the stack
 	bx lr             

.end

