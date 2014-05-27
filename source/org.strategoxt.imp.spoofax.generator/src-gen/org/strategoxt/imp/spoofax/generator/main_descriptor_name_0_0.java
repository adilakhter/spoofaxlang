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

@SuppressWarnings("all") public class main_descriptor_name_0_0 extends Strategy 
{ 
  public static main_descriptor_name_0_0 instance = new main_descriptor_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("main_descriptor_name_0_0");
    Fail26262:
    { 
      Success10535:
      { 
        Fail26263:
        { 
          term = $Main$Descriptor$Name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26263;
          if(true)
            break Success10535;
        }
        term = get_config_0_0.instance.invoke(context, generator.constSdfMainModuleFlag0);
        if(term == null)
          break Fail26262;
        term = termFactory.makeTuple(term, generator.const7468);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26262;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}