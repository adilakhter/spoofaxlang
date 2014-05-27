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
    Fail22771:
    { 
      IStrategoTerm term12135 = term;
      Success12127:
      { 
        Fail22772:
        { 
          IStrategoTerm w_4612 = null;
          IStrategoTerm x_4612 = null;
          IStrategoTerm y_4612 = null;
          IStrategoTerm z_4612 = null;
          IStrategoTerm c_4613 = null;
          IStrategoTerm e_4613 = null;
          IStrategoTerm f_4613 = null;
          w_4612 = term;
          c_4613 = term;
          IStrategoTerm term12136 = term;
          Success12128:
          { 
            Fail22773:
            { 
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail22773;
              { 
                if(true)
                  break Fail22772;
                if(true)
                  break Success12128;
              }
            }
            term = term12136;
          }
          term = w_4612;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail22772;
          x_4612 = ((IStrategoList)term).head();
          z_4612 = ((IStrategoList)term).tail();
          term = c_4613;
          IStrategoTerm term12137 = term;
          Success12129:
          { 
            Fail22774:
            { 
              IStrategoTerm b_4613 = null;
              b_4613 = term;
              IStrategoTerm term12138 = term;
              Success12130:
              { 
                Fail22775:
                { 
                  term = resolve_external_sources_0_0.instance.invoke(context, x_4612);
                  if(term == null)
                    break Fail22775;
                  y_4612 = term;
                  { 
                    if(true)
                      break Fail22774;
                    if(true)
                      break Success12130;
                  }
                }
                term = term12138;
              }
              term = b_4613;
              { 
                term = trans.constNil4;
                if(y_4612 == null)
                  y_4612 = term;
                else
                  if(y_4612 != term && !y_4612.match(term))
                    break Fail22772;
                if(true)
                  break Success12129;
              }
            }
            term = term12137;
          }
          f_4613 = term;
          term = this.invoke(context, z_4612);
          if(term == null)
            break Fail22772;
          e_4613 = term;
          term = f_4613;
          if(y_4612 == null)
            break Fail22772;
          term = termFactory.makeTuple(y_4612, e_4613);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22772;
          if(true)
            break Success12127;
        }
        term = term12135;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail22771;
        term = trans.constNil4;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}