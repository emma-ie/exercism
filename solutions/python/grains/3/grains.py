def square(number):
    squareNum = 1
    prevGrain = 1

    if number < 1 or number > 64:
        raise ValueError('square must be between 1 and 64')
    else:
        for squareNum in range(1, number):
            squareNum = prevGrain * 2
            prevGrain = squareNum
        return squareNum

def total():
    squareNum = 1 
    prevGrain = 1
    total = 1
    
    for squareNum in range(1, 64):
        squareNum = prevGrain * 2
        prevGrain = squareNum
        total += prevGrain
    return total