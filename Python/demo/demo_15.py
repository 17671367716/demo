#   creation time:2021/7/15 10:37
#   theme: 元组
#   不可变序列

t1 = ('a','b','b','c')
print(t1,type(t1))
t1 = 'A','B','B','B'
print(t1,type(t1))

t2 = tuple(('hello','python','!'))
print(t2,type(t2))

#   如果只有一个元素，需要使用,和（）
t3 = 'a',
print(t3,type(t3))
t3 = ('a',)
print(t3,type(t3))


t4 = tuple(('hello python !',))
print(t4,type(t4))

t = ('a',[1,2,3,],'b')
lst = t[1]
lst.append("hello python!")
print(lst)
print(t)



#   空列表，空字典，空元组
lst = []
lst = list()
d = {}
d = dict()
t = ()
t = tuple()
