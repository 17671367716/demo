#   creation time:2021/7/15 9:22
#   theme:  列表元素的删除

#   remove： 从列表中移除一个元素
#   pop:    根据索引移除元素
#   切片:     删除至少一个元素
#   clear:  清除列表中的所有元素
#   del:    删除列表

#   remove
#   从列表中移除一个元素，如果有重复元素只移除第一个元素
#   移除不存在的元素，会报错
lst1 =[10,20,30,40,50,60,30]
lst1.remove(30)
print(lst1)

#   pop
#   根据索引移除元素
#   指定索引不存在，会报错 pop index out of range
#   不知道参数，将删除列表中的最后一个元素
lst1 =[10,20,30,40,50,60,30]
lst1.pop(6)
print(lst1)

#   切片
#   删除至少一个元素，将产生一个新的列表对象
lst1 =[10,20,30,40,50,60]
lst2 = lst1[2:4]
print(lst1)
print(lst2)
#   不产生新的列表对象
lst1 =[10,20,30,40,50,60]
lst1[2:4]=[]
print(lst1)

#   clear
#   清除列表中的所有元素
lst1 =[10,20,30,40,50,60]
lst1.clear()
print(lst1)

#   del
#   删除列表
lst1 =[10,20,30,40,50,60]
del lst1
#   此时输出lst1会报错
# print(lst1)

