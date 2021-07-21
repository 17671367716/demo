#   creation time:2021/7/19 11:44
#   theme: 继承

class People(object):
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def eat(self):
        print("我叫 " + self.name + " ，我今年 " + self.age + " 岁,",end='')


class Man(People):
    def __init__(self, name, age, games):
        self.__abc = 123
        super().__init__(name, age)
        self.type = 'man'
        self.games = games

    def eat(self):
        super().eat()
        print('我喜欢打的游戏是' + self.games)


class Woman(People):
    def __init__(self, name, age, tv):
        super().__init__(name, age)
        self.type = 'man'
        self.tv = tv

    def eat(self):
        super().eat()
        print('我喜欢看的电视是' + self.tv)


man = Man('zhangsan', '18', 'cs')
print(man._Man__abc)
print(man.__dict__)
woman = Woman('ls', '16', '喜羊羊')
man.eat()
woman.eat()

print(dir(man))


class A:
    def eat(self):
        print("A")

class B:
    def eat(self):
        print('B')

class D:
    def eat(self):
        print('D')

class C(D,B,A):
    def __init__(self,id):
        self.id = id

c = C(18)
# print(c.id)
c.eat()
