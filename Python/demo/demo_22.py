#   creation time:2021/7/16 10:44
#   theme:  函数的创建和调用

def add(a, b):
    return a + b;

def sub(a,b):
    return a-b;

result = add(10, 20)
print(result)
print(sub(20,10))
print(sub(b= 20,a = 10))

#   位置参数 个数可变的参数情况
def f(*arg):
    print(arg)
#   关键字参数 个数可变的参数情况
def f2(**args):
    print(args)

f('a','c','b','d')
f2(a=1,v=2,f=3)
