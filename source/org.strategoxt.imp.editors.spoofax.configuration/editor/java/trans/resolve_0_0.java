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
    Fail22916:
    { 
      IStrategoTerm z_4631 = null;
      IStrategoTerm a_4632 = null;
      z_4631 = term;
      Success12206:
      { 
        Fail22917:
        { 
          IStrategoTerm term12230 = term;
          Success12207:
          { 
            Fail22918:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22918;
              if(true)
                break Success12207;
            }
            term = term12230;
            IStrategoTerm c_4632 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail22917;
            c_4632 = ((IStrategoList)term).head();
            IStrategoTerm arg8040 = ((IStrategoList)term).tail();
            if(arg8040.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8040).isEmpty())
              break Fail22917;
            term = c_4632;
          }
          term = get_config_reference_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22917;
          term = parse_spoofaxconfiguration_file_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22917;
          a_4632 = term;
          if(true)
            break Success12206;
        }
        term = z_4631;
        a_4632 = z_4631;
      }
      term = a_4632;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}