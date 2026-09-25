def square(number):
    """Return the number of grains on a given square"""
    square_num = 1
    prev_grain = 1

    if number < 1 or number > 64:
        raise ValueError('square must be between 1 and 64')

    for square_num in range(1, number):
        square_num = prev_grain * 2
        prev_grain = square_num
    return square_num

def total():
    """Return the total number of grains"""
    square_num = 1 
    prev_grain = 1
    total = 1
    
    for square_num in range(1, 64):
        square_num = prev_grain * 2
        prev_grain = square_num
        total += prev_grain
    return total