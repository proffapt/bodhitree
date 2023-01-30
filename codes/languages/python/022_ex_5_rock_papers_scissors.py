# Why am I doing this simple thing?
'''
    Well this is an amazing example of why I need to use maths in my program
    How maths can make my life easy and programming logics amazing

    How? - See the plan

         R P S <- Computer
         0 1 2
         -----
    R 0 |D L W 
    P 1 |W D L
    S 2 |L W D
    ^
    | 
    Me
'''
import random

rules = '''
    0 - Rock
    1 - Paper
    2 - Scissors
'''
print(rules)

score = [0, 0]
while True:
    my_choice = int(input('Enter a number between 0 & 2 : '))
    if not (0<=my_choice<=2):
        print('Invalid input. Please Enter number between 0 & 2.')
        continue

    computer_choice = random.randint(0,2)
    print(f'Computer chose : {computer_choice}')

    if my_choice is computer_choice:
        print('Draw')
    elif (computer_choice+1)%3==my_choice:
        print('You +1')
        score[0]+=1
    else:
        print('Computer +1')
        score[1]+=1

    if (score[0]+score[1] == 5):
        break

score_card = f'--------------------------------------\n Score Card :- Computer : {score[1]} , You : {score[0]} \n--------------------------------------'
print(score_card)
if score[1] < score[0]:
    print('You Won!')
else:
    print('You Lose')
