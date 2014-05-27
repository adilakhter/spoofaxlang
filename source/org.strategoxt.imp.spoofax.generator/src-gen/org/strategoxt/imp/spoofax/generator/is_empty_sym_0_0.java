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

@SuppressWarnings("all") public class is_empty_sym_0_0 extends Strategy 
{ 
  public static is_empty_sym_0_0 instance = new is_empty_sym_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_empty_sym_0_0");
    Fail25654:
    { 
      IStrategoTerm term10165 = term;
      IStrategoConstructor cons334 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10130:
      { 
        if(cons334 == SpoofaxGenerator._conslit_1)
        { 
          Fail25655:
          { 
            if(true)
              break Success10130;
          }
          term = term10165;
        }
        Success10131:
        { 
          if(cons334 == SpoofaxGenerator._consci_lit_1)
          { 
            Fail25656:
            { 
              if(true)
                break Success10131;
            }
            term = term10165;
          }
          Success10132:
          { 
            if(cons334 == SpoofaxGenerator._conslayout_0)
            { 
              Fail25657:
              { 
                if(true)
                  break Success10132;
              }
              term = term10165;
            }
            IStrategoTerm term10168 = term;
            Success10133:
            { 
              Fail25658:
              { 
                term = opt_1_0.instance.invoke(context, term, is_empty_sym_0_0.instance);
                if(term == null)
                  break Fail25658;
                if(true)
                  break Success10133;
              }
              term = term10168;
              IStrategoTerm term10169 = term;
              Success10134:
              { 
                Fail25659:
                { 
                  term = cf_1_0.instance.invoke(context, term, is_empty_sym_0_0.instance);
                  if(term == null)
                    break Fail25659;
                  if(true)
                    break Success10134;
                }
                term = term10169;
                IStrategoTerm term10170 = term;
                Success10135:
                { 
                  Fail25660:
                  { 
                    term = lex_1_0.instance.invoke(context, term, is_empty_sym_0_0.instance);
                    if(term == null)
                      break Fail25660;
                    if(true)
                      break Success10135;
                  }
                  term = label_2_0.instance.invoke(context, term10170, _Id.instance, is_empty_sym_0_0.instance);
                  if(term == null)
                    break Fail25654;
                }
              }
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