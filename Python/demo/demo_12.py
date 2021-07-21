#   creation time:2021/7/15 10:16
#   theme: 获取字典视图

scores = {'name':'张三','age':18,'school':'家里蹲'}

#   keys()
#   获取字典中所有的键
k = scores.keys()
print(k,type(k),id(k))
print(list(k))

#   values()
#   获取字典中所有的value
v = scores.values()
print(v,type(v),id(v))
print(list(v))

#   items()
#   获取字典中所有的k-v
kv = scores.items()
print(kv,type(kv),id(kv))
print(list(kv))
