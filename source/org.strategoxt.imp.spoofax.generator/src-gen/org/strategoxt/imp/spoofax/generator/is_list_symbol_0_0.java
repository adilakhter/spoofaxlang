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

@SuppressWarnings("all") public class is_list_symbol_0_0 extends Strategy 
{ 
  public static is_list_symbol_0_0 instance = new is_list_symbol_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_list_symbol_0_0");
    Fail25642:
    { 
      IStrategoTerm term10155 = term;
      Success10121:
      { 
        Fail25643:
        { 
          term = cf_1_0.instance.invoke(context, term, is_list_symbol_0_0.instance);
          if(term == null)
            break Fail25643;
          if(true)
            break Success10121;
        }
        term = term10155;
        IStrategoTerm term10156 = term;
        Success10122:
        { 
          Fail25644:
          { 
            term = iter_star_sep_2_0.instance.invoke(context, term, _Id.instance, _Id.instance);
            if(term == null)
              break Fail25644;
            if(true)
              break Success10122;
          }
          term = term10156;
          IStrategoTerm term10157 = term;
          Success10123:
          { 
            Fail25645:
            { 
              term = iter_sep_2_0.instance.invoke(context, term, _Id.instance, _Id.instance);
              if(term == null)
                break Fail25645;
              if(true)
                break Success10123;
            }
            term = term10157;
            IStrategoTerm term10158 = term;
            Success10124:
            { 
              Fail25646:
              { 
                term = iter_star_1_0.instance.invoke(context, term, _Id.instance);
                if(term == null)
                  break Fail25646;
                if(true)
                  break Success10124;
              }
              term = iter_1_0.instance.invoke(context, term10158, _Id.instance);
              if(term == null)
                break Fail25642;
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