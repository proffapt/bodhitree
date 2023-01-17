// Synchronous & Asyncrhonous Programming
/*
	Synchronous - Step by step, you wait until the step(s) before you is/are finished
	Asyncrhonous - You just go on without waiting for previous step(s) to end
		EXAMPLE: settimeout & setinterval
	
	To get more clarity, let's consider settimeout in Synchronous mode and Asyncrhonous mode:
		- Synchronous
			// CODE
				step 1
				settimeout step 2, 3
				step 3
			// RESULT
				step 1
				wait for 3 seconds & do nothing
				step 2
				step 3
		- Asyncrhonous
			// CODE
				step 1
				settimeout step 2, 3
				step 3
			// RESULT
				step 1
				background waiting for step 2 and continue
				step 3
				step 2 after 3 seconds from execution of settimeout
*/
