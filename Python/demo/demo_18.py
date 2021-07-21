#   creation time:2021/7/15 11:43
#   theme:  集合生成式

#   列表生成式
lst = [i for i in range(0,10)]
print(lst)

s = {i for i in range(0,10)}
print(s)

lst = [i**2 for i in range(0,10)]
print(lst)

s = {i**2 for i in range(0,10)}
print(s)
