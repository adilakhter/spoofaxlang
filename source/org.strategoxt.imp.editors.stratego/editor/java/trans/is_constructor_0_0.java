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
    Fail21585:
    { 
      IStrategoTerm term11684 = term;
      Success11609:
      { 
        Fail21586:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21586;
          term = $Declare$Cookie_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21586;
          term = $Declaration_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21586;
          if(true)
            break Success11609;
        }
        term = declaration_of_0_0.instance.invoke(context, term11684);
        if(term == null)
          break Fail21585;
      }
      IStrategoTerm term11685 = term;
      IStrategoConstructor cons545 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11610:
      { 
        if(cons545 == Main._consOpDecl_2)
        { 
          Fail21587:
          { 
            if(true)
              break Success11610;
          }
          term = term11685;
        }
        if(cons545 == Main._consExtOpDecl_2)
        { }
        else
        { 
          break Fail21585;
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