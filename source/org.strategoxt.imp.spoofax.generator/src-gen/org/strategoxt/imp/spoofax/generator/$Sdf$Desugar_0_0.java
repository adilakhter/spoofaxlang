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

@SuppressWarnings("all") public class $Sdf$Desugar_0_0 extends Strategy 
{ 
  public static $Sdf$Desugar_0_0 instance = new $Sdf$Desugar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail25454:
    { 
      IStrategoTerm term10037 = term;
      IStrategoConstructor cons326 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10035:
      { 
        if(cons326 == SpoofaxGenerator._consno_attrs_0)
        { 
          Fail25455:
          { 
            term = generator.constattrs0;
            if(true)
              break Success10035;
          }
          term = term10037;
        }
        if(cons326 == SpoofaxGenerator._consterm_1)
        { 
          IStrategoTerm d_4220 = null;
          IStrategoTerm arg5850 = term.getSubterm(0);
          if(arg5850.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consdefault_1 != ((IStrategoAppl)arg5850).getConstructor())
            break Fail25454;
          d_4220 = arg5850.getSubterm(0);
          term = termFactory.makeAppl(SpoofaxGenerator._consterm_1, new IStrategoTerm[]{d_4220});
        }
        else
        { 
          break Fail25454;
        }
      }
      if(true)
        return term;
    }
    context.push("SdfDesugar_0_0");
    context.popOnFailure();
    return null;
  }
}