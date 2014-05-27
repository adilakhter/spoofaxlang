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

@SuppressWarnings("all") public class copy_or_create_parse_table_0_0 extends Strategy 
{ 
  public static copy_or_create_parse_table_0_0 instance = new copy_or_create_parse_table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("copy_or_create_parse_table_0_0");
    Fail26578:
    { 
      IStrategoTerm term10946 = term;
      Success10802:
      { 
        Fail26579:
        { 
          term = copy_parse_table_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26579;
          if(true)
            break Success10802;
        }
        term = term10946;
        IStrategoTerm term10947 = term;
        Success10803:
        { 
          Fail26580:
          { 
            term = xtc_ensure_file_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26580;
            term = create_parse_table_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26580;
            if(true)
              break Success10803;
          }
          term = term10947;
          IStrategoTerm v_4362 = null;
          v_4362 = term;
          term = fatal_err_0_1.instance.invoke(context, v_4362, generator.const7658);
          if(term == null)
            break Fail26578;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}