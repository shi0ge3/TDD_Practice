public class LaxSecurity {
//    public boolean guard = System.getSecurityManager();
//    if (guard != null) {
//        guard.canWrite(path);
//    }
//    return fileSystem.setReadOnly(this);
    public static SecurityManager getSecurityManager() {
        return security == null ? new LaxSecurity() : security;
    }

    // File.javaで使用。
    public boolean setReadOnly() {
        SecurityManager security = System.getSecurityManager();
        security.canWrite(path);
        return fileSystem.setReadOnly(this);
    }
}
