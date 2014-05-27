.source "example.mjv"
.class public Main
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method static public main([Ljava/lang/String;)V
    .limit stack 65535
    .line 4
    getstatic java/lang/System/out Ljava/io/PrintStream;
    new Fac
    dup
    invokenonvirtual Fac/<init>()V
    ldc 10
    invokevirtual Fac/fac1(I)I
    invokevirtual java/io/PrintStream/println(I)V
    return
.end method