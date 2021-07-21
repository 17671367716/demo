#   creation time:2021/7/15 9:59
#   theme:  字典
#   键值对，无序，可变序列
#   key不能重复，value可以重复
#   key是不可变对象

#   创建字典
scores = {'name':'张三','age':18}
print(scores,type(scores),id(scores))

scores2 = dict(name='张三',age=18)
print(scores2,type(scores2),id(scores2))

#   获取字典元素
#   如果查找的key不存在，第一种会报错，第二种会返回一个None
print(scores['name'])
print(scores2.get("name"))
print(scores2.get('key','当key不存在时，返回的默认值'))

#   判断key是否存在
print('key' in scores)
print('key' not in scores)

#   删除指定的key-value
del scores['age']
print(scores)

#   清空字典
scores.clear()
print(scores)

#   新增
scores['school']='家里蹲'
print(scores)

#   修改
scores['school'] = '网吧蹲'
print(scores)
