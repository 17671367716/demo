#   creation time:2021/7/19 11:32
#   theme: 类

class Student:

    #   用__作前缀的属性，表示不希望在类的外部被访问，但是可以在类的内部使用

    def __init__(self, name, school, age):
        self.name = name
        self.school = school
        self.__age = age

    def eat(self):
        print('我的名字叫 ' + self.name + ' ,今年 ' + self.age + ' 岁,在 ' + self.school + '读书')


a = Student('zhangsan', '家里蹲大学', '18')
b = Student('lisi', '网吧蹲大学', '22')

a.eat()
b.eat()

