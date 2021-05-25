public class LaxSecurity {
    public boolean guard = System.getSecurityManager();
    if (guard != null) {
        guard.canWrite(path);
    }
    return fileSystem.setReadOnly(this);
}
