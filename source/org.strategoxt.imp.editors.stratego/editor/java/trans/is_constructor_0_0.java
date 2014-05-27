package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class is_constructor_0_0 extends Strategy 
{ 
  public static is_constructor_0_0 instance = new is_constructor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_constructor_0_0");
    Fail23061:
    { 
      IStrategoTerm term12393 = term;
      Success12318:
      { 
        Fail23062:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail23062;
          term = $Declare$Cookie_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23062;
          term = $Declaration_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23062;
          if(true)
            break Success12318;
        }
        term = declaration_of_0_0.instance.invoke(context, term12393);
        if(term == null)
          break Fail23061;
      }
      IStrategoTerm term12394 = term;
      IStrategoConstructor cons589 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12319:
      { 
        if(cons589 == Main._consOpDecl_2)
        { 
          Fail23063:
          { 
            if(true)
              break Success12319;
          }
          term = term12394;
        }
        if(cons589 == Main._consExtOpDecl_2)
        { }
        else
        { 
          break Fail23061;
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