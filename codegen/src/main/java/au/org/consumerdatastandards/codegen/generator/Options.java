package au.org.consumerdatastandards.codegen.generator;

import au.org.consumerdatastandards.support.model.ModelBuilderOptions;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import java.util.ArrayList;
import java.util.List;

@Parameters(commandDescription = "Perform Code Generation Tasks")
public class Options implements ModelBuilderOptions {

    @Parameter(names= {"--generator", "-g"}, description = "Class name of cds-codegen generator", order = 1)
    private String generatorClassName = "au.org.consumerdatastandards.codegen.generator.openapi.SwaggerGenerator";

    @Parameter(names = {"--included", "-i"}, description = "Include Section (comma separated)", order = 2)
    private List<String> includedSections = new ArrayList<>();

    @Parameter(names = {"--excluded", "-e"}, description = "Exclude Section (comma separated)", order = 3)
    private List<String> excludedSections = new ArrayList<>();

    @Parameter(names = {"--help", "-?", "-h" }, help = true)
    private boolean help;

    public Options include(List<String> includedSections) {
        this.includedSections = includedSections;
        return this;
    }

    public Options exclude(List<String> excludedSections) {
        this.excludedSections = excludedSections;
        return this;
    }

    public void setIncludedSections(List<String> includedSections) {
        this.includedSections = includedSections;
    }

    public void setExcludedSections(List<String> excludedSections) {
        this.excludedSections = excludedSections;
    }

    public String getGeneratorClassName() {
        return generatorClassName;
    }

    public boolean isSectionIncluded(String sectionName) {
        return includedSections.isEmpty() && excludedSections.isEmpty()
            || includedSections.contains(sectionName)
            || !excludedSections.isEmpty() && !excludedSections.contains(sectionName);
    }

    public boolean isHelp() {
        return help;
    }
}