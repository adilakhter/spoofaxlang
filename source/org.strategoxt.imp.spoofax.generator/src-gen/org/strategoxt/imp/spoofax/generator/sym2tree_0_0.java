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

@SuppressWarnings("all") public class sym2tree_0_0 extends Strategy 
{ 
  public static sym2tree_0_0 instance = new sym2tree_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sym2tree_0_0");
    Fail25661:
    { 
      IStrategoTerm term10171 = term;
      Success10136:
      { 
        Fail25662:
        { 
          IStrategoTerm c_4245 = null;
          c_4245 = term;
          term = sym2nonterm_0_0.instance.invoke(context, c_4245);
          if(term == null)
            break Fail25662;
          term = termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{term});
          if(true)
            break Success10136;
        }
        term = term10171;
        IStrategoTerm term10172 = term;
        IStrategoConstructor cons335 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success10137:
        { 
          if(cons335 == SpoofaxGenerator._conscf_1)
          { 
            Fail25663:
            { 
              IStrategoTerm a_4245 = null;
              a_4245 = term.getSubterm(0);
              term = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{a_4245});
              IStrategoTerm term10173 = term;
              Success10138:
              { 
                Fail25664:
                { 
                  term = is_nonterm_generator_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25664;
                  { 
                    if(true)
                      break Fail25663;
                    if(true)
                      break Success10138;
                  }
                }
                term = term10173;
              }
              term = this.invoke(context, a_4245);
              if(term == null)
                break Fail25663;
              if(true)
                break Success10137;
            }
            term = term10172;
          }
          Success10139:
          { 
            if(cons335 == SpoofaxGenerator._conslex_1)
            { 
              Fail25665:
              { 
                term = generator.constRef0;
                if(true)
                  break Success10139;
              }
              term = term10172;
            }
            Success10140:
            { 
              if(cons335 == SpoofaxGenerator._conschar_class_1)
              { 
                Fail25666:
                { 
                  term = generator.constRef1;
                  if(true)
                    break Success10140;
                }
                term = term10172;
              }
              Success10141:
              { 
                if(cons335 == SpoofaxGenerator._conslabel_2)
                { 
                  Fail25667:
                  { 
                    IStrategoTerm y_4244 = null;
                    y_4244 = term.getSubterm(1);
                    term = this.invoke(context, y_4244);
                    if(term == null)
                      break Fail25667;
                    if(true)
                      break Success10141;
                  }
                  term = term10172;
                }
                IStrategoTerm v_4244 = null;
                v_4244 = term;
                term = get_nonterm_of_0_0.instance.invoke(context, v_4244);
                if(term == null)
                  break Fail25661;
                term = termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term})});
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