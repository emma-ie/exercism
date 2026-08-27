"""Functions for determining triangle types."""

def equilateral(sides):
    """Checks if a triangle is equilateral.

    Args: 
        sides: A list containing 3 side lengths
    Returns: 
        True if all 3 sides are of equal length, otherwise False
    """
    if sides[0] == sides[1] and sides[1] == sides[2]:
        if triangle(sides):
            return True
    return False

def isosceles(sides):
    """Checks if a triangle is isosceles.

    Args:
        sides: A list containing 3 side lengths
    Returns: True if at least 2 sides have the same length, otherwise False
    """
    if sides[0] == sides[1] or sides[0] == sides[2] or sides[1] == sides[2]:
        if triangle(sides):
            return True
    return False

def scalene(sides):
    """Checks if a triangle is scalene.

    Args: 
        sides: A list containing 3 side lengths
    Returns: True if all side lengths are different, otherwise False
    """
    if sides[0] != sides[1] and sides[0] != sides[2] and sides[1] != sides[2]:
        if triangle(sides):
            return True
    return False

def triangle(sides):
    """Checks if the side lengths form a triangle.
    
    Args:
        sides: A list containing 3 side lengths
    Returns: True if the side lengths form a valid triangle, otherwise False
    """
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