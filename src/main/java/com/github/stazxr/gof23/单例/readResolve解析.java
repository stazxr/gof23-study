//public final Object readObject() throws IOException, ClassNotFoundException {
//    ...
//    // if nested read, passHandle contains handle of enclosing object
//    int outerHandle = passHandle;
//    try {
//    // 核心方法
//    Object obj = readObject0(false);
//    ......
//}
//
//private Object readObject0(boolean unshared) throws IOException {
//    try {
//        switch (tc){
//            ...
//            case TC_OBJECT:
//                // 反序列化对象，核心方法：readOrdinaryObject
//                return checkResolve(readOrdinaryObject(unshared));
//            ...
//        }
//    } finally {
//        depth--;
//        bin.setBlockDataMode(oldMode);
//    }
//}
//
//private Object readOrdinaryObject(boolean unshared) throws IOException {
//    ...
//    // isInstantiable 为 true，则执行 desc.newInstance() 通过反射创建新对象
//    Object obj = desc.isInstantiable() ? desc.newInstance() : null;
//    ...
//
//    // 在类中添加 readResolve 方法后，desc.hasReadResolveMethod() 方法返回 true
//    if (obj != null && handles.lookupException(passHandle) == null && desc.hasReadResolveMethod()) {
//        // 通过反射调用类中的 readResolve 方法 ( readResolveMethod.invoke(obj, (Object[]) null); )，将返回值赋值给 rep
//        Object rep = desc.invokeReadResolve(obj);
//
//        ...
//        // 这里会将 rep 赋值给 obj
//        handles.setObject(passHandle, obj = rep);
//    }
//
//    return obj;
//}