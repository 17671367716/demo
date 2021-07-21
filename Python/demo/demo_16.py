#   creation time:2021/7/15 11:27
#   theme: 集合
#   可变序列，无序

s = {'a', 1, 'hello', 3.14}

# for item in s:
#     print(item)

print(s)

s = set(range(1, 5))
print(s)

s1 = set(range(5))
s2 = set(range(0, 10))
s3 = set(range(2, 12))

print(s1.issubset(s2))
print(s1.issubset(s3))

print(s2.issuperset(s1))
print(s3.issuperset(s1))
print("---")
print(s1.isdisjoint(s2))
print(s1.isdisjoint(s3))
print(s2.isdisjoint(s3))

s4 = set(range(10, 20))
print(s2.isdisjoint(s4))
