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

@SuppressWarnings("all") public class parse_table_target_0_0 extends Strategy 
{ 
  public static parse_table_target_0_0 instance = new parse_table_target_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parse_table_target_0_0");
    Fail26595:
    { 
      term = generator.const7132;
      IStrategoTerm term10957 = term;
      Success10813:
      { 
        Fail26596:
        { 
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26596;
          if(true)
            break Success10813;
        }
        term = mkdir_0_0.instance.invoke(context, term10957);
        if(term == null)
          break Fail26595;
      }
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26595;
      term = termFactory.makeTuple(generator.const7420, term, generator.const7670);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26595;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}