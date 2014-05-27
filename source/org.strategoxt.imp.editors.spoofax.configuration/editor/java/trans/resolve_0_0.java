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

@SuppressWarnings("all") public class resolve_0_0 extends Strategy 
{ 
  public static resolve_0_0 instance = new resolve_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("resolve_0_0");
    Fail87724:
    { 
      IStrategoTerm w_17575 = null;
      IStrategoTerm x_17575 = null;
      w_17575 = term;
      Success47293:
      { 
        Fail87725:
        { 
          IStrategoTerm term47317 = term;
          Success47294:
          { 
            Fail87726:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87726;
              if(true)
                break Success47294;
            }
            term = term47317;
            IStrategoTerm z_17575 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail87725;
            z_17575 = ((IStrategoList)term).head();
            IStrategoTerm arg30015 = ((IStrategoList)term).tail();
            if(arg30015.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg30015).isEmpty())
              break Fail87725;
            term = z_17575;
          }
          term = get_config_reference_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87725;
          term = parse_spoofaxconfiguration_file_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87725;
          x_17575 = term;
          if(true)
            break Success47293;
        }
        term = w_17575;
        x_17575 = w_17575;
      }
      term = x_17575;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}