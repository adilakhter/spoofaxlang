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

@SuppressWarnings("all") final class lifted6935 extends Strategy 
{ 
  TermReference x_4818;

  TermReference y_4818;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23969:
    { 
      IStrategoTerm term12610 = term;
      Success12720:
      { 
        Fail23970:
        { 
          if(x_4818.value == null)
            break Fail23970;
          term = x_4818.value;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail23970;
          if(true)
            break Success12720;
        }
        term = term12610;
        IStrategoTerm term12611 = term;
        Success12721:
        { 
          Fail23971:
          { 
            if(x_4818.value == null)
              break Fail23971;
            term = x_4818.value;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail23971;
            IStrategoTerm arg8297 = ((IStrategoList)term).head();
            if(arg8297.getTermType() != IStrategoTerm.APPL || Main._consInternal_0 != ((IStrategoAppl)arg8297).getConstructor())
              break Fail23971;
            IStrategoTerm arg8298 = ((IStrategoList)term).tail();
            if(arg8298.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8298).isEmpty())
              break Fail23971;
            if(true)
              break Success12721;
          }
          term = term12611;
          if(y_4818.value == null)
            break Fail23969;
          term = declaration_of_0_0.instance.invoke(context, y_4818.value);
          if(term == null)
            break Fail23969;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consExtSDef_3 != ((IStrategoAppl)term).getConstructor())
            break Fail23969;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}