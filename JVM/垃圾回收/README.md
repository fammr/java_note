# 垃圾回收 基本原理算法

+ 标记-整理
+ 标记-清除（会导致大量碎片产生）
+ 复制算法
+ 分代收集算法

## 垃圾回收器
{
    新生代：{
        Serial
        ParNew
        Parallel Scavenge
    }
    G1
    老生代：{
      CMS
      Serial Old
      Paralled Old

    }
}


+ Serial
```
最古老的收集器
单线程
{
    新生代：采用复制算法
    老生代：采用标记-整理算法
}
Stop the world
Client 模式下，最高效的收集器4
```

+ ParNew
```
Serial的多线程版本
```
+ Parallel Scavenge收集器

```
目标是达到一个可控的吞吐量
```

+ CMS收集器（标记-清除算法）
JDK1.5

+ G1
```
整体（标记-清除）
局部（复制）

大对象直接进入老生代，一般参数设置位3mb
长期存活的对象，直接进入老生代
```

























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































