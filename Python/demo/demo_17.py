#   creation time:2021/7/15 11:36
#   theme: 集合的数学操作

s1 = {1,2,3}
s2 = {2,3,4}
s3 = {4,5,6}

#   交集
print(s1 & s2)
print(s2.intersection(s3))

#   并集
print(s1 | s2)
print(s1.union(s3))

#   差集
print(s1 - s2)
print(s2.difference(s3))

#   对称差集
print(s1^s2)
print(s2.symmetric_difference(s3))

