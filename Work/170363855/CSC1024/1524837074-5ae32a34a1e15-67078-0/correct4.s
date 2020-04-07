	.global correct4
correct4:
	push {R1-R12}     	@ Pushes these registers onto a stack
    	and R10, R0, #1    	@ The number is masked to get the first bit 
    	mov R1, R10        	@ The bit is moved to register 1
        
    	mov R10, R0       	@ Move the value of register 0 to register 10
    	lsr R10, #1       	@ The value is shifted once to te right
    	and R10, R10, #1   	@ The number is masked to get the first bit 
    	mov R2, R10        	@ The bit is moved to register 2
   
    
    	mov R10, R0        	@ Move the value of register 0 to register 10
    	lsr R10, #2       	@ The value is shifted three times to te right
    	and R10, R10, #1    	@ The number is masked to get the first bit 
    	mov R3, R10        	@ The bit is moved to register 3

    
    	mov R10, R0        	@ Move the value of register 0 to register 10
    	lsr R10, #3        	@ The value is shifted three times to te right
    	and R10, R10, #1    	@ The number is masked to get the first bit 
    	mov R4, R10        	@ The bit is moved to register 4
    
    	mov R10, R0        	@ Move the value of register 0 to register 10
    	lsr R10, #4        	@ The value is shifted four times to te right
    	and R10, R10, #1    	@ The number is masked to get the first bit 
    	mov R5, R10        	@ The bit is moved to register 5

    
    	mov R10, R0        	@ Move the value of register 0 to register 10
    	lsr R10, #5        	@ The value is shifted five times to te right
    	and R10, R10, #1    	@ The number is masked to get the first bit 
    	mov R6, R10        	@ The bit is moved to register 6

    
    	mov R10, R0        	@ Move the value of register 0 to register 10
    	lsr R10, #6        	@ The value is shifted six times to te right
    	and R10, R10, #1    	@ The number is masked to get the first bit 
    	mov R7, R10        	@ The bit is moved to register 7

    	eor R9, R3, R1    	@ The registers 3 and 1 are put through a exclusive or and the result is then given to register 9
    	eor R9, R9, R5    	@ The registers 9 and 5 are put through a exclusive or and the result is then given to register 9
        eor R9, R9, R4    	@ The registers 9 and 4 are put through a exclusive or and the result is then given to register 9

        eor R11, R2, R3    	@ The registers 2 and 3 are put through a exclusive or and the result is then given to register 11
    	eor R11, R11, R4   	@ The registers 11 and 4 are put through a exclusive or and the result is then given to register 11
    	eor R11, R11, R6    	@ The registers 11 and 6 are put through a exclusive or and the result is then given to register 11

        eor R12, R3, R1    	@ The registers 3 and 1 are put through a exclusive or and the result is then given to register 12
    	eor R12, R12, R4    	@ The registers 12 and 4 are put through a exclusive or and the result is then given to register 12
    	eor R12, R12, R7    	@ The registers 12 and 7 are put through a exclusive or and the result is then given to register 12
    
    	cmp R9, #1        	@ The register 9 is being compared to 1
	mov R8, #0        	@ If the register matches with 1 move 0 to register 8
	cmp R9, #0        	@ The register 9 is being compared to 0
	mov R8, #1 		@ If the register matches with 0 move 1 to register 8

    	cmp R11, #1        	@ The register 11 is being compared to 1
	mov R5, #0	 	@ If the register matches with 1 move 0 to register 5
	cmp R11, #0        	@ The register 11 is being compared to 0
	mov R5, #1	 	@ If the register matches with 0 move 1 to register 5
    
    	cmp R12, #1        	@ The register 12 is being compared to 1
	mov R6, #0	 	@ If the register matches with 1 move 0 to register 6	
	cmp R12, #0        	@ The register 12 is being compared to 0
	mov R6, #1	 	@ If the register matches with 0 move 1 to register 6
	
	and R5, R5, R9 		@ The registers 5 and 9 are put through a and gate the result is then given to register 5
	and R5, R5, R12  	@ The registers 5 and 12 are put through a and gate the result is then given to register 5

	and R8, R8, R11  	@ The registers 8 and 11 are put through a and gate the result is then given to register 8
	and R8, R8, R12  	@ The registers 8 and 12 are put through a and gate the result is then given to register 8

	and R6, R6, R11  	@ The registers 6 and 11 are put through a and gate the result is then given to register 6
	and R6, R6, R9   	@ The registers 6 and 9 are put through a and gate the result is then given to register 6

	and R12, R12, R9  	@ The registers 12 and 9 are put through a and gate the result is then given to register 12
	and R12, R12, R11 	@ The registers 12 and 11 are put through a and gate the result is then given to register 12

        eor R5, R5, R1    	@ The registers 5 and 1 are put through a exclusive or and the result is then given to register 5
    	eor R8, R8, R2    	@ The registers 8 and 2 are put through a exclusive or and the result is then given to register 8
    	eor R6, R6, R3		@ The registers 6 and 3 are put through a exclusive or and the result is then given to register 6
	eor R12, R12, R4 	@ The registers 12 and 4 are put through a exclusive or and the result is then given to register 12	

	mov R0,#0       	@ The value 0 is being moved to register 0

    	cmp R5,#1        	@ The register 5 is being compared to 1
    	addeq R0, #1     	@ If the register matches with 1 add 1 to register 0

    	cmp R8,#1         	@ The register 8 is being compared to 1
    	addeq R0, #2     	@ If the register matches with 1 add 2 to register 0

  	cmp R6,#1         	@ The register 6 is being compared to 1
    	addeq R0, #4     	@ If the register matches with 1 add 4 to register 0

  	cmp R12,#1        	@ The register 12 is being compared to 1
    	addeq R0, #8      	@ If the register matches with 1 add 8 to register 0

 	pop {R1-R12}       	@ Pops these registers of the stack
 	bx lr             

.end

