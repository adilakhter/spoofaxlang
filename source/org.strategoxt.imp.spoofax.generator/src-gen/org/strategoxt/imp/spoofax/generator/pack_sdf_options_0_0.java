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

@SuppressWarnings("all") public class pack_sdf_options_0_0 extends Strategy 
{ 
  public static pack_sdf_options_0_0 instance = new pack_sdf_options_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("pack_sdf_options_0_0");
    Fail25501:
    { 
      IStrategoTerm term10071 = term;
      Success10054:
      { 
        Fail25502:
        { 
          term = include_from_dir_option_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25502;
          if(true)
            break Success10054;
        }
        term = term10071;
        IStrategoTerm term10072 = term;
        Success10055:
        { 
          Fail25503:
          { 
            term = include_from_def_option_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25503;
            if(true)
              break Success10055;
          }
          term = term10072;
          IStrategoTerm term10073 = term;
          Success10056:
          { 
            Fail25504:
            { 
              term = dep_options_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25504;
              if(true)
                break Success10056;
            }
            term = of_option_0_0.instance.invoke(context, term10073);
            if(term == null)
              break Fail25501;
          }
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