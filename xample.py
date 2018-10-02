def func(a, b):
    a = b + 1
    b = func(a, b)
    if a > 1:
        b = b + 1
    elif a >= 1:
        b = b - 1
    elif b < 1:
        c = b + 1
        a = func(b, c)
    else:
        while a > b:
            b = b + 1
            c = b * 2
            pass
        a = a + 1
        pass
    return a


a = 12
b = 7
c = 3

while a >= b:
    b = b + a
    c = a + c
    pass
