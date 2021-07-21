#   creation time:2021/7/14 17:16
#   theme:  列表元素的添加

#   append： 添加到列表的末尾
#   extend： 向列表的末尾一次添加多个元素
#   insert： 在指定位置上添加一个元素
#   切  片：  在指定位置上添加多个元素

#   append
#   lst1.append(lst2) ： 将lst2作为一个元素添加到列表的末尾
lst1 =[10,20,30]
lst2 = ['hello','python']
lst1.append(lst2)
print(lst1)

#   extend
#   lst1.extend(lst2) ： 向列表lst1的末尾一次添加多个元素
lst1 =[10,20,30]
lst2 = ['hello','python']
lst1.extend(lst2)
print(lst1)

#   insert
#   在指定位置上添加一个元素
lst1 =[10,20,30]
lst1.insert(lst1.index(20),15)
print(lst1)

#   切片
#   在指定位置上添加多个元素
lst1 =[10,20,30]
lst2 = ['hello','python']
lst1[1:2] = lst2
print(lst1)
lst1 =[10,20,30]
lst2 = ['hello','python']
lst1[lst1.index(20):lst1.index(20)] = lst2
print(lst1)
lst1 =[10,20,30]
lst2 = ['hello','python']
lst1[-1:-2] = lst2
print(lst1)
