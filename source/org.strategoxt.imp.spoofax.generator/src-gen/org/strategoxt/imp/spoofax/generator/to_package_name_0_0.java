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

@SuppressWarnings("all") public class to_package_name_0_0 extends Strategy 
{ 
  public static to_package_name_0_0 instance = new to_package_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("to_package_name_0_0");
    Fail25748:
    { 
      IStrategoTerm term10231 = term;
      IStrategoConstructor cons341 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10178:
      { 
        if(cons341 == SpoofaxGenerator._consCompilationUnit_3)
        { 
          Fail25749:
          { 
            IStrategoTerm x_4256 = null;
            IStrategoTerm arg6185 = term.getSubterm(0);
            if(arg6185.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSome_1 != ((IStrategoAppl)arg6185).getConstructor())
              break Fail25749;
            IStrategoTerm arg6186 = arg6185.getSubterm(0);
            if(arg6186.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consPackageDec_2 != ((IStrategoAppl)arg6186).getConstructor())
              break Fail25749;
            IStrategoTerm arg6188 = arg6186.getSubterm(1);
            if(arg6188.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consPackageName_1 != ((IStrategoAppl)arg6188).getConstructor())
              break Fail25749;
            x_4256 = arg6188.getSubterm(0);
            term = map_1_0.instance.invoke(context, x_4256, lifted9221.instance);
            if(term == null)
              break Fail25749;
            if(true)
              break Success10178;
          }
          term = term10231;
        }
        if(cons341 == SpoofaxGenerator._consCompilationUnit_3)
        { 
          IStrategoTerm arg6191 = term.getSubterm(0);
          if(arg6191.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNone_0 != ((IStrategoAppl)arg6191).getConstructor())
            break Fail25748;
          term = generator.constNil7;
        }
        else
        { 
          break Fail25748;
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