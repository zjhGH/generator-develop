package com.baomidou.mybatisplus.generator.config.builder;

import com.baomidou.mybatisplus.generator.config.IConfigBuilder;

/**
 * 自定义模板文件配置
 *
 * @author xusimin
 * @since 3.5.3
 */
public class CustomFile {

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 模板路径
     */
    private String templatePath;

    /**
     * 自定义文件包名
     */
    private String packageName;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 是否覆盖已有文件（默认 false）
     */
    private boolean fileOverride;

    public boolean isFileOverride() {
        return fileOverride;
    }

    public String getFileName() {
        return fileName;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getFilePath() {
        return filePath;
    }

    /**
     * 构建者
     */
    public static class Builder implements IConfigBuilder<CustomFile> {

        private final CustomFile customFile;

        public Builder() {
            this.customFile = new CustomFile();
        }

        /**
         * 文件名
         */
        public CustomFile.Builder fileName(String fileName) {
            this.customFile.fileName = fileName;
            return this;
        }

        /**
         * 模板路径
         */
        public CustomFile.Builder templatePath(String templatePath) {
            this.customFile.templatePath = templatePath;
            return this;
        }

        /**
         * 包路径
         */
        public CustomFile.Builder packageName(String packageName) {
            this.customFile.packageName = packageName;
            return this;
        }

        /**
         * 文件路径，默认为 PackageConfig.parent 路径
         */
        public CustomFile.Builder filePath(String filePath) {
            this.customFile.filePath = filePath;
            return this;
        }

        /**
         * 覆盖已有文件
         */
        public CustomFile.Builder enableFileOverride() {
            this.customFile.fileOverride = true;
            return this;
        }

        @Override
        public CustomFile build() {
            return this.customFile;
        }
    }
}
