package org.example.good.java.annotation.processor.lombok;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;


@SupportedAnnotationTypes({"org.example.good.java.annotation.annotation.lombok.Getter"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class LombokProcessor extends AbstractProcessor {

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        Messager messager = processingEnv.getMessager();
        messager.printMessage(Diagnostic.Kind.NOTE, "LombokProcessor ...... init.");

    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        Messager messager = processingEnv.getMessager();
        messager.printMessage(Diagnostic.Kind.NOTE, String.format("annotation size: %d", set.size()));

        if(set.isEmpty()){
            return false;
        }

        for(TypeElement annotation: set) {
            Set<? extends Element> elements = roundEnvironment.getElementsAnnotatedWith(annotation);
            messager.printMessage(Diagnostic.Kind.NOTE, String.format("Annotation %s has annotated %d class.",
                    annotation.getSimpleName(), elements.size()));
            for(Element element: elements){
                messager.printMessage(Diagnostic.Kind.NOTE, String.format("Annotated class: %s.", element.getSimpleName()));
            }
        }
        return true;
    }
}
