package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_external_sources_0_0 extends Strategy 
{ 
  public static get_external_sources_0_0 instance = new get_external_sources_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_external_sources_0_0");
    Fail87579:
    { 
      IStrategoTerm term47222 = term;
      Success47214:
      { 
        Fail87580:
        { 
          IStrategoTerm t_17556 = null;
          IStrategoTerm u_17556 = null;
          IStrategoTerm v_17556 = null;
          IStrategoTerm w_17556 = null;
          IStrategoTerm z_17556 = null;
          IStrategoTerm b_17557 = null;
          IStrategoTerm c_17557 = null;
          t_17556 = term;
          z_17556 = term;
          IStrategoTerm term47223 = term;
          Success47215:
          { 
            Fail87581:
            { 
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail87581;
              { 
                if(true)
                  break Fail87580;
                if(true)
                  break Success47215;
              }
            }
            term = term47223;
          }
          term = t_17556;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail87580;
          u_17556 = ((IStrategoList)term).head();
          w_17556 = ((IStrategoList)term).tail();
          term = z_17556;
          IStrategoTerm term47224 = term;
          Success47216:
          { 
            Fail87582:
            { 
              IStrategoTerm y_17556 = null;
              y_17556 = term;
              IStrategoTerm term47225 = term;
              Success47217:
              { 
                Fail87583:
                { 
                  term = resolve_external_sources_0_0.instance.invoke(context, u_17556);
                  if(term == null)
                    break Fail87583;
                  v_17556 = term;
                  { 
                    if(true)
                      break Fail87582;
                    if(true)
                      break Success47217;
                  }
                }
                term = term47225;
              }
              term = y_17556;
              { 
                term = trans.constNil14;
                if(v_17556 == null)
                  v_17556 = term;
                else
                  if(v_17556 != term && !v_17556.match(term))
                    break Fail87580;
                if(true)
                  break Success47216;
              }
            }
            term = term47224;
          }
          c_17557 = term;
          term = this.invoke(context, w_17556);
          if(term == null)
            break Fail87580;
          b_17557 = term;
          term = c_17557;
          if(v_17556 == null)
            break Fail87580;
          term = termFactory.makeTuple(v_17556, b_17557);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87580;
          if(true)
            break Success47214;
        }
        term = term47222;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail87579;
        term = trans.constNil14;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}