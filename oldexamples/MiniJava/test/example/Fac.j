.source "example.mjv"
.class public Fac
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public fac1(I)I
    .limit locals 3
    .limit stack 4
    .line 12
    iload 1
    ldc 1
    if_icmplt true6
    iconst_0
    goto done0
    true6 :
    iconst_1
    done0 :
    ifeq else5
    .line 13
    ldc 1
    istore 2
    goto done1
    else5 :
    .line 15
    iload 1
    aload_0
    iload 1
    ldc 1
    isub
    invokevirtual Fac/fac1(I)I
    imul
    istore 2
    done1 :
    .line 16
    iload 2
    ireturn
.end method