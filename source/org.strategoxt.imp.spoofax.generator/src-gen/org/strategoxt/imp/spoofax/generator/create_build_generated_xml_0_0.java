package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class create_build_generated_xml_0_0 extends Strategy 
{ 
  public static create_build_generated_xml_0_0 instance = new create_build_generated_xml_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_build_generated_xml_0_0");
    Fail26701:
    { 
      IStrategoTerm c_4388 = null;
      IStrategoTerm e_4388 = null;
      IStrategoTerm f_4388 = null;
      term = concat_strings_0_0.instance.invoke(context, generator.constCons5132);
      if(term == null)
        break Fail26701;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      e_4388 = term;
      c_4388 = generator.constCons5133;
      f_4388 = e_4388;
      term = output_text_file_0_2.instance.invoke(context, f_4388, c_4388, generator.const7846);
      if(term == null)
        break Fail26701;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}