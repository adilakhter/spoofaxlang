package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class pp_attr_0_0 extends Strategy 
{ 
  public static pp_attr_0_0 instance = new pp_attr_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("pp_attr_0_0");
    Fail75765:
    { 
      IStrategoTerm term41514 = term;
      IStrategoConstructor cons1777 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41500:
      { 
        if(cons1777 == Main._consterm_1)
        { 
          Fail75766:
          { 
            IStrategoTerm w_92030 = null;
            IStrategoTerm y_92030 = null;
            IStrategoTerm arg25939 = term.getSubterm(0);
            if(arg25939.getTermType() != IStrategoTerm.APPL || Main._consdefault_1 != ((IStrategoAppl)arg25939).getConstructor())
              break Fail75766;
            w_92030 = arg25939.getSubterm(0);
            term = implode_aterm_0_0.instance.invoke(context, w_92030);
            if(term == null)
              break Fail75766;
            term = pp_aterm_box_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75766;
            y_92030 = term;
            term = box2text_string_0_1.instance.invoke(context, y_92030, trans.const15489);
            if(term == null)
              break Fail75766;
            if(true)
              break Success41500;
          }
          term = term41514;
        }
        Success41501:
        { 
          if(cons1777 == Main._consassoc_1)
          { 
            Fail75767:
            { 
              IStrategoTerm v_92030 = null;
              v_92030 = term.getSubterm(0);
              term = pp_assoc_0_0.instance.invoke(context, v_92030);
              if(term == null)
                break Fail75767;
              if(true)
                break Success41501;
            }
            term = term41514;
          }
          Success41502:
          { 
            if(cons1777 == Main._consavoid_0)
            { 
              Fail75768:
              { 
                term = trans.const15490;
                if(true)
                  break Success41502;
              }
              term = term41514;
            }
            Success41503:
            { 
              if(cons1777 == Main._consprefer_0)
              { 
                Fail75769:
                { 
                  term = trans.const15491;
                  if(true)
                    break Success41503;
                }
                term = term41514;
              }
              Success41504:
              { 
                if(cons1777 == Main._consreject_0)
                { 
                  Fail75770:
                  { 
                    term = trans.const15492;
                    if(true)
                      break Success41504;
                  }
                  term = term41514;
                }
                if(cons1777 == Main._consbracket_0)
                { 
                  term = trans.const15493;
                }
                else
                { 
                  break Fail75765;
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