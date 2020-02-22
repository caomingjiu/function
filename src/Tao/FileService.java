package Tao;

/**
 * @author Tao
 */
@FunctionalInterface
public interface FileService {
    /**
     * 查找type类型的文件，在一个文件包下
     * @param type
     */
    void setFileName(String type);
}
