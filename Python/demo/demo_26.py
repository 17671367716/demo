#   creation time:2021/7/19 17:40
#   theme: 浅拷贝和深拷贝

import copy


class A:
    def __init__(self):
        pass

class B:
    def __init__(self):
        pass

class C:
    pass

class D:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

a = A()
b = B()
c = C()
d = D(a, b, c)

d1 = copy.copy(d)
d2 = copy.deepcopy(d)

print(d, d.a, d.b, d.c)
print(d1, d1.a, d1.b, d1.c)
print(d2, d2.a, d2.b, d2.c)

print("-----------------")
print(d.__dict__)
print(d1.__dict__)
print(d2.__dict__)
