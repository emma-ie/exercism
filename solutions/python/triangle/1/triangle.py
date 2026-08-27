def equilateral(sides):
    if sides[0] == sides[1] and sides[1] == sides[2]:
        if triangle(sides):
            return True
    return False

def isosceles(sides):
    if sides[0] == sides[1] or sides[0] == sides[2] or sides[1] == sides[2]:
        if triangle(sides):
            return True
    return False

def scalene(sides):
    if sides[0] != sides[1] and sides[0] != sides[2] and sides[1] != sides[2]:
        if triangle(sides):
            return True
    return False

def triangle(sides):
    check1 = False
    check2 = False
    check3 = False
    
    if sides[0] == 0 or sides[1] == 0 or sides[2] == 0:
        return False
    
    if (sides[0] + sides[1]) >= sides[2]:
        check1 = True
    if (sides[1] + sides[2]) >= sides[0]:
        check2 = True
    if (sides[0] + sides[2]) >= sides[1]:
        check3 = True

    if check1 and check2 and check3:
        return True
    return False