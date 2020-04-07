	.global correct16

correct16: 	push{R1-R12}
	   	mov R1, #1
	   	mov R2, #1
		mov R3, #1
		mov R4, #0
		mov R5, #0
nextrow:	mov R6, #0
		mov R7, #0
		mov R8, #1
loopword:	add R11,R6,#1
		and R9,R1,R0, lsr R6
		and R10,R1,R9, lsr R5
		and R10, R9
		cmp R11, R2
		moveq R12,R9
		cmp R11,R8
		lsleq R8, #1
		addeq R6, #1
		beq loopword
		eor R7,R10
		add R6,#1
		cmp R6,#20
		ble loopword
		cmp R12, R7
		addne R4,R2
		lsl R2, #1
		add R5,#1
		cmp R2, #16
		
		mov R2, #0
	   	mov R6, #0
		mov R8, #0
		mov R3, #1
loopplace:	add R7, R6, #1
		add R10, R8, #1
		and R9,R1,R0, lsr R8
		cmp R3,R10
		addeq R8, #1
		lsleq R3, #1
		beq loopplace
		cmp R4,R10
		eoreq R9,#1
		orr R2, R9, lsr R6
		add R6, #1
		add R8, #1
		cmp R6, #15
		ble loopplace
		mov R0,R2
		
		pop {R1-R12}
		bx	LR

	.end