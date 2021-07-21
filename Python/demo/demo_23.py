#   creation time:2021/7/19 9:47
#   theme: 类

#   在类之外定义的称为函数，在类之内定义的称为方法

"""
类方法
    定义：使用装饰器@classmethod。第一个参数必须是当前类对象，该参数名一般约定为“cls”，通过它来传递类的属性和方法（不能传实例的属性和方法）；
    调用：类和实例对象都可以调用。

静态方法
    定义：使用装饰器@staticmethod。参数随意，没有“self”和“cls”参数，但是方法体中不能使用类或实例的任何属性和方法；
    调用：类和实例对象都可以调用。
"""
class Student:

    # 直接写在类里的变量，成为类属性
    id = None

    #   初始化方法,进行赋值操作，将局部变量赋值给实体属性
    def __init__(self,name,age):
        self.name = name
        self.age = age

    #   实例方法
    def eat(self):
        print('实例方法')


    #   静态方法
    @staticmethod
    def method():
        id = 16
        print('静态方法，使用了staticmethod')
        print('method ' ,id)

    #   类方法
    @classmethod
    def cm(cls):
        cls.id = 20
        print('类方法,使用了@classmethod')

# def f():
#     print('函数')

# print(id(Student),type(Student),Student)
a = Student('zhangsan',123)
print(a.name)
print(a.age)
a.eat()
Student.method()
a.method()
a.cm()
Student.cm()
print(a.id)
