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

@SuppressWarnings("all") public class construct_text_1_1 extends Strategy 
{ 
  public static construct_text_1_1 instance = new construct_text_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4269, IStrategoTerm w_4269)
  { 
    context.push("construct_text_1_1");
    Fail25845:
    { 
      IStrategoTerm term10280 = term;
      Success10219:
      { 
        Fail25846:
        { 
          term = construct_text_from_origin_1_1.instance.invoke(context, term, x_4269, w_4269);
          if(term == null)
            break Fail25846;
          if(true)
            break Success10219;
        }
        term = term10280;
        IStrategoTerm term10281 = term;
        Success10220:
        { 
          Fail25847:
          { 
            term = construct_text_for_primitive_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25847;
            if(true)
              break Success10220;
          }
          term = term10281;
          IStrategoTerm term10282 = term;
          Success10221:
          { 
            Fail25848:
            { 
              term = construct_text_base_list_1_1.instance.invoke(context, term, x_4269, w_4269);
              if(term == null)
                break Fail25848;
              if(true)
                break Success10221;
            }
            term = term10282;
            IStrategoTerm term10283 = term;
            Success10222:
            { 
              Fail25849:
              { 
                term = construct_text_by_pp_rec_1_1.instance.invoke(context, term, x_4269, w_4269);
                if(term == null)
                  break Fail25849;
                if(true)
                  break Success10222;
              }
              term = construct_text_by_pp_1_1.instance.invoke(context, term10283, x_4269, w_4269);
              if(term == null)
                break Fail25845;
            }
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