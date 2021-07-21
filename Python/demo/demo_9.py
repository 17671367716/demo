#   creation time:2021/7/15 9:45
#   theme: 列表排序

#   sort()
#   不产生新的列表对象
#   参数reverse默认为False,升序，当参数reverse=True时表示降序
lst1 =[10,20,30,50,70,40,60]
lst2 = ['aa','ad','ac','ab']
lst1.sort()
lst2.sort()
print(lst1)
print(lst2)
lst1.sort(reverse=True)
lst2.sort(reverse=True)
print(lst1)
print(lst2)


#   内置函数sorted()
#   会产生一个新的列表
lst1 =[10,20,30,50,70,40,60]
lst2 = ['aa','ad','ac','ab']
print(sorted(lst1))
print(sorted(lst2))
print(sorted(lst1,reverse=True))
print(sorted(lst2,reverse=True))
