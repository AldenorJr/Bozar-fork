package com.vimasig.bozar.obfuscator.utils.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BozarConfig {

    private final String exclude;
    private final List<String> libraries;
    private final Options options;

    public BozarConfig(String exclude, List<String> libraries, Options options) {
        this.exclude = exclude;
        this.libraries = libraries;
        this.options = options;
    }

    public String getExclude() {
        return exclude;
    }

    public List<String> getLibraries() {
        return libraries;
    }

    public Options getOptions() {
        return options;
    }

    public static class Options {
        public enum LineNumberOption {
            @SerializedName("Keep") KEEP,
            @SerializedName("Delete") DELETE,
            @SerializedName("Scramble") SCRAMBLE
        }

        public enum LocalVariableOption {
            @SerializedName("Keep") KEEP,
            @SerializedName("Delete") DELETE,
            @SerializedName("Obfuscate") OBFUSCATE
        }

        public enum ConstantObfuscationOption {
            @SerializedName("Off") OFF,
            @SerializedName("Light") LIGHT,
            @SerializedName("Flow") FLOW
        }

        private final boolean rename;
        private final LineNumberOption lineNumbers;
        private final LocalVariableOption localVariables;
        private final boolean removeSourceFile;
        private final boolean controlFlowObfuscation;
        private final ConstantObfuscationOption constantObfuscation;

        public Options(boolean rename, LineNumberOption lineNumbers, LocalVariableOption localVariables, boolean removeSourceFile, boolean controlFlowObfuscation, ConstantObfuscationOption constantObfuscation) {
            this.rename = rename;
            this.lineNumbers = lineNumbers;
            this.localVariables = localVariables;
            this.removeSourceFile = removeSourceFile;
            this.controlFlowObfuscation = controlFlowObfuscation;
            this.constantObfuscation = constantObfuscation;
        }

        public boolean isRename() {
            return rename;
        }

        public LineNumberOption getLineNumbers() {
            return lineNumbers;
        }

        public LocalVariableOption getLocalVariables() {
            return localVariables;
        }

        public boolean isRemoveSourceFile() {
            return removeSourceFile;
        }

        public ConstantObfuscationOption getConstantObfuscation() {
            return constantObfuscation;
        }

        public boolean isControlFlowObfuscation() {
            return controlFlowObfuscation;
        }
    }
}
